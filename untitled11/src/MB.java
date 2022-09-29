import java.io.File;

public class MB {
    public static void MBS (){
        File file = new File("C:\\Users\\olegv\\Desktop\\829IvaTBJ2g.psd"); //Путь к файлу

        long size = file.length();
        System.out.println(size/(1024*1024) + " МБ"); //вычисление
    }}