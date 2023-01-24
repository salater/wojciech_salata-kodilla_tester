public class FirstClass {
public static void main(String[] args) {
    Notebook notebook = new Notebook(605, 1000, 2000 );
    System.out.println("notebook weight/price/years: " + notebook.weight + "/" + notebook.price +"/" +notebook.year);
    notebook.checkPrice();
    notebook.checkWeight();
    notebook.checkStatus();
    /*if (notebook.price < 900) {
        System.out.println("The notebook is cheap");
    } else {
        System.out.println("The nootebok  is quite expensive" );}*/

    Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
    System.out.println("heavyNotebook weight/price: " + heavyNotebook.weight + "/" + heavyNotebook.price + "/" + heavyNotebook.year);
    heavyNotebook.checkPrice();
    heavyNotebook.checkWeight();
    heavyNotebook.checkStatus();

    Notebook oldNotebook = new Notebook(1600, 500, 1980);
    System.out.println("oldNotebook weight/price: " + oldNotebook.weight + "/" + oldNotebook.price + "/" + oldNotebook.year);
    oldNotebook.checkPrice();
    oldNotebook.checkWeight();
    oldNotebook.checkStatus();

    Notebook whatNotebook = new Notebook(700, 500, 2022 );
    System.out.println("whatNotebook weight/price/years: " + whatNotebook.weight + "/" + whatNotebook.price +"/" + whatNotebook.year);
    whatNotebook.checkPrice();
    whatNotebook.checkWeight();
    whatNotebook.checkStatus();
 }
}

