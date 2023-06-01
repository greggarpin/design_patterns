package garpin.design_patterns.abstract_factory;

public class PlainWriterFactory implements WriterFactory
{
    @Override
    public Writer getAsciiWriter()
    {
        return new PlainWriter();
    }
}