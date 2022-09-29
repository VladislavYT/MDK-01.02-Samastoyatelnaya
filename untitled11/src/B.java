import java.io.File;

public class B {
    public static void BS (){
        File file = new File("C:\\Users\\olegv\\Desktop\\829IvaTBJ2g.psd"); //Путь к файлу

        long size = file.length();
        System.out.println(size + " Б"); //вычисление
    }}