public class AplikasiTodoList {
    public static String[] model = new String[10];

    public static void main(String[] args) {
        testShowTodoList();
    }

    /**
     * Start Bisnis Logic
     */
    /**
     * Method untuk "showToDo" (menampilkan data task yang sudah di input ke dalam aplikais)
     */
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "Belajar Dasar MySQL";
        model[1] = "Belajar Dasar Java";
        showTodoList();
    }

    /**
     * Method untuk "addToDo" (menambahkan data task ke dalam aplikasi)
     */
    public static void addTodoList() {

    }

    /**
     * Method untuk "removeToDo" (menghapus data task yang sudah di input ke dalam aplikasi)
     */
    public static void removeTodoList() {

    }
    /**
     * End Bisnis Logic
     */

    /**
     * Method untuk "viewShowToDo" (menampilkan halaman view ToDoList)
     */
    public static void viewShowTodoList() {

    }

    /**
     * Method untuk "viewddToDo" (menampilkan halaman view add ToDoList)
     */
    public static void viewAddTodoList() {

    }

    /**
     * Method untuk "viewRemoveToDo" (menampilkan halaman view delete ToDoList)
     */
    public static void viewRemoveTodoList() {

    }
}
