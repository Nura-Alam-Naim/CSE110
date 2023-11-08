public class Main {
    public static void main(String[] args) {
        java.io.File file=new java.io.File("image/us.gif");
        System.out.println("Does it exists? "+file.exists());
        System.out.println("The file has "+file.length()+" bytes");
        System.out.println("Can it be read? "+file.canRead());
        System.out.println("Can it be written? "+file.canWrite());
        System.out.println("Is this a directory? "+file.isDirectory());
        System.out.println("Is is absolute? "+file.isAbsolute());
        System.out.println("Is it hidden? "+file.isHidden());
        System.out.println("Absolute path is : "+file.getAbsolutePath());
        System.out.println("Last modified: "+new java.util.Date(file.lastModified()));
    }
}