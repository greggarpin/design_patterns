package garpin.design_patterns.abstract_factory;

public class CapsWriterFactory extends WriterFactory
{
    @Override
    public Writer getAsciiWriter()
    {
        return new CapsWriter();
    }
}