package garpin.design_patterns.abstract_factory;

public abstract class WriterFactory
{
    public abstract Writer getAsciiWriter();

    public static WriterFactory getFactory(String type) throws Exception
    {
        String className = System.getProperty("writerFactory.plain");

        return (WriterFactory)Class.forName(className).getDeclaredConstructor().newInstance();
    }
}