package Position;

public class main {
   public static void main(String[] args) {
            Position[] employees = {
                    new Director(),
                    new Worker(),
                    new Accountant()
            };

            for (Position employee : employees) {
                employee.printPosition();
            }
        }
    }
