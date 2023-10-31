package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ListDesafio1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados? ");
        int n = input.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            boolean achouId = true;
            Integer id = null;

            while (achouId) {
                System.out.print("Empregado #" + (i + 1) + ":\n");
                System.out.print("Id: ");
                id = input.nextInt();

                boolean idEmUso = false;

                for (Employee employee : list) {
                    if (employee.getId() == id) {
                        System.out.println("ID em uso, insira outro valor!");
                        idEmUso = true;
                        break;
                    }
                }

                if (!idEmUso) {
                    achouId = false;
                }
            }

            input.nextLine(); // Limpar a quebra de linha deixada no buffer

            System.out.print("Nome: ");
            String name = input.nextLine();

            System.out.print("Salário: ");
            double salary = input.nextDouble();
            System.out.println();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.println("Entre com o ID do empregado para aumentar o salário: ");
        int idSalary = input.nextInt();
        boolean achou = false;
        int indice = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idSalary) {
                System.out.println("Informe a porcentagem de aumento:");
                double porcentagem = input.nextDouble();
                list.get(i).increaseSalary(porcentagem);
                indice = i;
                achou = true;
            }
        }

        if (achou) {
            System.out.println("\nO novo salário de " + list.get(indice).getName() + " é:");
            System.out.println("Salário: " + list.get(indice).getSalary());
        } else {
            System.out.println("Esse ID não existe.");
        }

        System.out.println("--------------------------------------------");
        System.out.println("LISTA DE EMPREGADOS:");
        for (Employee empregado : list) {
            System.out.println(empregado.getId() + ", " + empregado.getName() + ", $$ " + empregado.getSalary());
        }

        input.close();
    }
}
