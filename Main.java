import entity.People;
import service.PeopleService;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    private static final PeopleService service = new PeopleService();

    public static void main(String[] args) {
        System.out.println("----------SEJA BEM VINDO----------");
        System.out.println("Selecione o que deseja fazer: \n1.Cadastrar Pessoa \n2.Listar todos os cadastros \n3.Alterar nome por id");
        System.out.print("R-> ");
        int n = input.nextInt();

        switch (n){
            case 1:
                createPeople();
                break;
            case 2:
                findAll();
                break;
        }
    }

    public static void createPeople() {
        System.out.println(" ");
        System.out.println("----------CADASTRE UMA PESSOA----------");
        People people = new People();

        System.out.println("Preencha os campos:");
        System.out.println("Nome:");
        people.setName(input.next());
        System.out.println("numero:");
        people.setNumber(input.next());
        System.out.println("email:");
        people.setEmail(input.next());

        service.create(people);

        System.out.println("--------------------------------------");
        System.out.println("Selecione o que deseja fazer: \n1.Cadastrar Pessoa \n2.Listar todos os cadastros \n3.Alterar nome por id");
        System.out.print("R-> ");
        int n = input.nextInt();

        switch (n){
            case 1:
                createPeople();
                break;
            case 2:
                findAll();
                break;
            case 3:
                updateName();
                break;
        }
    }

    public static void findAll() {
        System.out.println(" ");
        System.out.println("----------TODOS OS CADASTROS----------");
        service.findAll();

        System.out.println("--------------------------------------");
        System.out.println("Selecione o que deseja fazer: \n1.Cadastrar Pessoa \n2.Listar todos os cadastros \n3.Alterar nome por id");
        System.out.print("R-> ");
        int n = input.nextInt();

        switch (n){
            case 1:
                createPeople();
                break;
            case 2:
                findAll();
                break;
            case 3:
                updateName();
                break;
        }
    }

    public static void updateName() {
        System.out.println(" ");
        System.out.println("----------ALTERE O NOME----------");

        System.out.println("Preencha os campos:");
        System.out.println("Id:");
        int id = input.nextInt();
        System.out.println("Nome:");
        String nome = input.next();

        service.updateName(id, nome);

        System.out.println("--------------------------------------");
        System.out.println("Selecione o que deseja fazer: \n1.Cadastrar Pessoa \n2.Listar todos os cadastros \n3.Alterar nome por id");
        System.out.print("R-> ");
        int n = input.nextInt();

        switch (n){
            case 1:
                createPeople();
                break;
            case 2:
                findAll();
                break;
            case 3:
                updateName();
                break;
        }
    }
}
