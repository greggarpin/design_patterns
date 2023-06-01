package garpin.design_patterns.abstract_factory;

public class PlainWriterFactory extends WriterFactory
{
    @Override
    public Writer getAsciiWriter()
    {
        return new PlainWriter();
    }
}