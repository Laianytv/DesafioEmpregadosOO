package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do departamento: ");
		String departamentName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int departamenPayDay = sc.nextInt();
		sc.nextLine();
		System.out.print("Email: ");
		String addresEmail = sc.nextLine();
		System.out.print("Telefone: ");
		String addresPhone = sc.nextLine();

		Department department = new Department(departamentName, departamenPayDay,
				new Address(addresEmail, addresPhone));

		System.out.print("Quantos funcionários tem o departamento?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionário " + i + ":");
			System.out.print("Nome:");
			sc.nextLine();
			String empName = sc.nextLine();
			System.out.print("Salário:");
			double empSalary = sc.nextDouble();

			Employee employees = new Employee(empName, empSalary);
			department.addEmployee(employees);

		}

		System.out.println();

		showReport(department);

		sc.close();

	}

	private static void showReport(Department department) {

		System.out.println(department.toString());

	}

}
