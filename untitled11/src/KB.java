import java.io.File;

public class KB {
    public static void KBS (){
        File file = new File("C:\\Users\\olegv\\Desktop\\829IvaTBJ2g.psd"); //Путь к файлу

        long size = file.length();
        System.out.println(size/1024 + " КБ"); //вычисление
    }}