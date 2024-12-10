package com.example.challengeAlura;

import com.example.challengeAlura.model.Book;
import com.example.challengeAlura.model.Person;
import com.example.challengeAlura.service.GutendexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ChallengeAluraApplication implements CommandLineRunner {

	private final GutendexService gutendexService;

	// Inyección del servicio a través del constructor
	@Autowired
	public ChallengeAluraApplication(GutendexService gutendexService) {
		this.gutendexService = gutendexService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ChallengeAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		boolean continuar = true;
		while (continuar) {
			// Mostrar el menú
			System.out.println("===== Menú =====");
			System.out.println("1. Buscar un libro");
			System.out.println("6. Salir");
			System.out.print("Seleccione una opción: ");
			int opcion = scanner.nextInt();
			scanner.nextLine();  // Consumir el salto de línea después de la opción


			switch (opcion) {
				case 1:
					// Opción 1: Buscar un libro
					System.out.print("Ingrese el nombre del libro: ");
					String query = scanner.nextLine();
					buscarLibro(query);
					break;

				case 6:
					// Opción 6: Salir
					System.out.println("Saliendo del programa...");
					continuar = false;
					break;

				default:
					System.out.println("Opción no válida. Por favor seleccione una opción válida.");
					break;
			}

		}

		scanner.close();  // Cerrar el scanner
	}

	// Método para realizar la búsqueda de libros
	private void buscarLibro(String query) {
		System.out.println("Buscando el libro: " + query);
		try {
			var firstBook = gutendexService.searchFirstBookByTitle(query);

			if (firstBook != null) {
				mostrarInformacionCompletaDelLibro(firstBook);
			} else {
				System.out.println("No se encontraron libros para la búsqueda: " + query);
			}
		} catch (Exception e) {
			System.err.println("Ocurrió un error al buscar el libro: " + e.getMessage());
		}
	}

	private void mostrarInformacionCompletaDelLibro(Book book) {
		System.out.println("Información del libro encontrado:");
		System.out.println("ID: " + book.getId());
		System.out.println("Título: " + book.getTitle());

		// Mostrar los autores
		if (book.getAuthors() != null && !book.getAuthors().isEmpty()) {
			System.out.print("Autor: ");
			String autores = book.getAuthors().stream()
					.map(Person::getName) // Obtener el nombre de cada autor
					.reduce((a, b) -> a + ", " + b) // Combinar los nombres en una cadena
					.orElse("No disponible");
			System.out.println(autores);
		} else {
			System.out.println("Autores: No disponible");
		}

		// Mostrar el lenguaje
		System.out.println("Lenguaje: " + book.getLanguages());




	}


}
