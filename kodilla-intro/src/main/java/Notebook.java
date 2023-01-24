public class Notebook {
  int weight;
  int price;
  int year;
    public Notebook (int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
      }

      public void checkPrice() {
          if (this.price < 600) {
              System.out.println("This notebook is very Cheap");
          } else if (this.price >= 600 && this.price <= 1000) {
              System.out.println("The notebook price is good");
          } else {
              System.out.println("The notebook is expensive");
          }
      }
        public void checkWeight() {
            if(this.weight <= 600) {
                System.out.println("The notebook is light");
            } else if(this.weight > 600 && this.weight < 2000){
                System.out.println("The notebook weight is good");
            } else {
                System.out.println("The notebook is very heavy");
            }
          }
        public void checkStatus() {
        if(this.year <=2000 && this.price < 650 ){
            System.out.println("The notebook have IDE disc and Intel Pentium");
        }else if(this.year > 2019 && this.price < 501) {
            System.out.println("The notebook is broken :)");
        } else if (this.year >=2020 && this.weight >= 1600) {
          System.out.println("This notebook is very good and used SSD disc");
        } else if(this.price <= 1000 && this.year >=2000) {
            System.out.println("The notebook have good value for price");
        }
        }

      }


