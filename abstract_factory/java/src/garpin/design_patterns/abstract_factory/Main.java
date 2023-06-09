package garpin.design_patterns.abstract_factory;

public class Main
{
    public static void main(String[] args)
    {
        if (args.length != 2) {
            showHelp();
            System.exit(1);
        }

        try {
            init();

            String outString = args[0];
            String typeString = args[1];

            WriterFactory factory = WriterFactory.getFactory(typeString);

            writeString(outString, factory);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private static void writeString(String outString, WriterFactory factory)
    {
        factory.getAsciiWriter().write(outString);
    }

    private static void showHelp()
    {
        System.out.println("Please provide an output string");
    }

    private static void init()
    {
        // Manually set properties here. Note that in a "real" (non-practice) project, these would come from
        // some external resource (a config file, a database, etc.)
        System.setProperty("writerFactory.plain", "garpin.design_patterns.abstract_factory.PlainWriterFactory");
        System.setProperty("writerFactory.boxed", "garpin.design_patterns.abstract_factory.BoxedWriterFactory");
        System.setProperty("writerFactory.caps", "garpin.design_patterns.abstract_factory.CapsWriterFactory");
    }
}
