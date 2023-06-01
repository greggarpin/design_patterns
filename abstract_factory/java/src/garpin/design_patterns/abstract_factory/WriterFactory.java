package garpin.design_patterns.abstract_factory;

import javax.naming.NameNotFoundException;

public abstract class WriterFactory
{
    public abstract Writer getAsciiWriter();

    public static WriterFactory getFactory(String type) throws Exception
    {
        String className = System.getProperty("writerFactory.plain");

        if (type.equalsIgnoreCase("boxed")) {
            className = System.getProperty("writerFactory.boxed");
        }

        if (type.equalsIgnoreCase("caps")) {
            className = System.getProperty("writerFactory.caps");
        }

        if (className == null) {
            throw new NameNotFoundException("Could not load class for type " + type);
        }

        return (WriterFactory)Class.forName(className).getDeclaredConstructor().newInstance();
    }
}