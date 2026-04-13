package module7.activity;


// program accepts a user name and checks validity
public class CustomExceptionActivityTest {

    public static void main(String[] args) {
        CustomExceptionActivityTest test = new CustomExceptionActivityTest();

        String[] users = {"John", "Shanti", "Sarah"};

        //loop through all users so program doesn't stop on first error
        for (String user : users) {
            try {
                test.validateUser(user);
            } catch (CustomExceptionActivity e) {
                System.out.println("User '" + user + "' is NOT valid");
                System.out.println(e.getMessage());
            }
            System.out.println("----------------------");
        }
    }

    void validateUser(String name) throws CustomExceptionActivity {

        // array of valid users
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

        int flag = 0;

        //check if name exists in array
        for (int i = 0; i < validUsers.length; i++) {
            if (name.equals(validUsers[i])) {
                flag = 1;
                break;
            }
        }

        //if no match → throw exception
        if (flag == 0) {
            throw new CustomExceptionActivity();
        } else {
            //valid user
            System.out.println("User '" + name + "' is valid. Welcome to Payroll program!");
        }
    }
   }