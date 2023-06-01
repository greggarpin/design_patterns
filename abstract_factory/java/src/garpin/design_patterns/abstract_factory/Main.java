package garpin.design_patterns.abstract_factory;

public class Main
{
    public static void main(String[] args)
    {
        if (args.length != 1) {
            showHelp();
            System.exit(1);
        }

        String outString = args[0];

        WriterFactory factory = new PlainWriterFactory();

        writeString(outString, factory);
    }

    private static void writeString(String outString, WriterFactory factory)
    {
        factory.getAsciiWriter().write(outString);
    }

    private static void showHelp()
    {
        System.out.println("Please provide an output string");
    }
}
