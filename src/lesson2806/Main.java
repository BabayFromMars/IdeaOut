package lesson2806;

import java.io.*;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.out;


public class Main {
  /*  public static Date a;
    public static final String FileName = "aa.txt";
    public static final String dirName = ".";
    public static File[] files;*/
/*  public static final String sourceFileName = "source.txt";
  public static final String destFileName = "dest.txt";*/
//  public static final String sourceFileName= "source.txt";

    public static void main(String[] args) throws IOException {
//========================================================================
/*
        double sum = 0.0;
        Scanner scan = new Scanner("1,3; 2,0; 8,5; 4,8; 9,0; 1; 10");
        scan.useDelimiter(";\\s*");
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                System.out.println(scan.next());
            } else {
                sum += scan.nextDouble();
            }
        }
        System.out.printf("Сумма чисел = " + sum);
*/


//========================================================================
/*
        // First, write the data.
        try ( DataOutputStream dout =
                      new DataOutputStream(new FileOutputStream("Test.dat")) )
        {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);

        } catch(FileNotFoundException e) {
            System.out.println("Cannot Open Output File");
            return;
        } catch(IOException e) {
            System.out.println("I/O Error: " + e);
        }

        // Now, read the data back.
        try ( DataInputStream din =
                      new DataInputStream(new FileInputStream("Test.dat")) )
        {

            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("Here are the values: " +
                    d + " " + i + " " + b);
        } catch(FileNotFoundException e) {
            System.out.println("Cannot Open Input File");
            return;
        } catch(IOException e) {
            System.out.println("I/O Error: " + e);
        }
*/


//========================================================================
/*        RandomAccessFile raf = new RandomAccessFile(sourceFileName,"rw");
//обеспечивает чтение и запись данных в любом месте файла.

        out.println(raf.length());
        raf.seek(10);//перемещает указатель файла на pos байтов от начала файла.
        String s=raf.readLine();
        out.println(new String (s.getBytes(),"UTF-8"));
        raf.seek(raf.length());
        raf.writeUTF("привет");
        raf.close();*/


//========================================================================
/*        InputStream inFile   = new FileInputStream("/home/babay/home/babay/Документы/IdeaOut/aa.txt");

        readFullyByByte(inFile);
        System.out.print("\n\n\n");
        System.out.println("*************************");

        InputStream inUrl = new URL("http://google.com").openStream();

        readFullyByByte(inUrl);
        System.out.print("\n\n\n");
        System.out.println("*************************");

        InputStream inArray = new ByteArrayInputStream(new byte[] {65, 66,
                67, 68, 69});
        readFullyByByte(inArray);
        System.out.print("\n\n\n");
    }

    public static void readFullyByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }*/
//========================================================================

/*
        //Разбор текстового файла на строки, слова, символы
BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
PrintWriter write = new PrintWriter(destFileName);

String s = null;
int words = 0, lines = 0, chars = 0;
while ((s = reader.readLine())!=null)
{
    lines++;
    String[] ws = s.trim().split("\\s");
    words += ws.length;
    for(String l:ws)
        chars += l.length();
    write.println(s.toUpperCase());
}
reader.close();
write.close();
out.printf("Скопировано символов - %d; слов -%d; строк - %d\n",
        chars, words, lines);*/

//========================================================================
/*        FileInputStream st = new FileInputStream("aa.txt");
        out.print("\n_____________Работа с потоками читаем по байтам__________\n");
        while (st.available() != 0) {
            int b = st.read();
            char ch = (char) b;
            out.print(ch);
        }
        st.close();
        FileOutputStream so = new FileOutputStream("aa2.txt");
        String d = "Hello, motherfucka";
        byte[] bytes = d.getBytes();
        so.write(bytes);
        so.close();

        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        String s = null;
        out.print("\n_________Работа с буферридером читаем по строкам______\n");
        while ((s = reader.readLine()) != null) {
            out.print(s);
        }
        reader.close();
        PrintWriter write = new PrintWriter("out1.txt");
        write.printf("%s %d %c", "Строка", 100, 'ё');
        write.close();*/

//============================================================

     /*   File f1 = new File(FileName);
        if (!f1.exists()) {
            out.printf("File %s doesn't exist", f1.getAbsolutePath());
        } else {
            out.println("__________Работа с файлами_________");
            a = new Date(f1.lastModified());
            out.printf("File %s Date: %s Size :%d\n", f1.getName(),
                    a.toString(), f1.length());
        }
        File d1 = new File(dirName);
        if (!d1.exists()) {
            out.printf("Dir %s doesn't doesn't exist", d1.getAbsolutePath());
        } else {
            if (d1.isDirectory())
                out.println("____________Работа с папками_____________");
            out.println(d1.getName());
            files = d1.listFiles(); // список файллов в папке
            for (File file : files) {
                if (file.isDirectory()) //проверка есть ли папка
                    out.println(file.getName().toUpperCase());
                else
                    out.println(file.getName().toLowerCase());
            }
        }

*/

//============================================================
        //       System.out.println(new File("aa.txt").getAbsolutePath());

//============================================================
 /*       for (File file : new File(".").listFiles()) {
            System.out.println(file.getName());
        }*/

        //Stream
//============================================================
/*        System.out.println(new Random().ints(77, 120)
        .limit(70)
        .mapToObj(s -> (char) s + "")
        .collect(Collectors.joining()));*/
//============================================================
/*Stream<Date> stream = Stream.generate(() -> {return new Date();});
stream.forEach(p -> System.out.println(p));*/

//============================================================

/*        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);*/
//============================================================

/*        Arrays.asList("a1", "a2", "b1", "c2", "c1")
                .stream()
                .findFirst()
                .ifPresent(s -> System.out.println(s));*/
//============================================================

/*        IntStream.range(1, 4)
                .forEach(s -> System.out.println(s));*/
//============================================================

/*     Arrays.stream(new int[] {1,2,3})
     .map(n -> 2 * n + 1)
     .average()
     .ifPresent(s -> System.out.println(s));*/
//============================================================

/*Stream.of("a1", "a2", "b1", "c2", "c1")
        .map(s -> s.substring(1))
        .mapToInt(Integer::parseInt)
        .max()
        .ifPresent(s -> System.out.println(s));*/
//============================================================

/*IntStream.range(1, 4)
        .mapToObj(i -> "a" + i)
        .forEach(s -> System.out.println(s));*/
//============================================================

    }
}
