// Online IDE - Code Editor, Compiler, Interpreter

class ExpectionDemo {
    static String message;

    public static void main(String[] args) {
        try {
            String message = getMessage();
            System.out.println(message);
        } catch (Exception e) {
            message += "F";
            System.out.print(message);
        } finally {
            System.out.println(message);
        }
    }

    public static String getMessage() throws Exception {
        String message = "A";
        try {
            throw new Exception();
        } catch (Exception e) {
            message += "B";
        }
        throw new Exception();
    }catch(

    Exception ex)
    {
        message += "C";
    }finally
    {
        message += "D";
    }finally
    {
        message += "E";

    }return message;
}
