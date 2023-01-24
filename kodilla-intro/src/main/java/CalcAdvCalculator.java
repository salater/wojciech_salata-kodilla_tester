public class CalcAdvCalculator {
    public double calculate() {
        String userSelected = CalcUserDialogs.getUserSelection();
        int a = CalcUserDialogs.getValue();
        int b = CalcUserDialogs.getValue();
        double result = 0;
        switch (userSelected) {
            case "ADD":
                result = a + b;
                break;
            case "SUB":
                result = a - b;
               break;
            case "DIV":
                result = a / b;
              break;
            case "MUL":
                result = a * b;
                break;
        }
         return result;
    }
}
