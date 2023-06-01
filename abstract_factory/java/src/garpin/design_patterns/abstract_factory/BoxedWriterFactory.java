package garpin.design_patterns.abstract_factory;

public class BoxedWriterFactory extends WriterFactory
{
    @Override
    public Writer getAsciiWriter()
    {
        return new BoxedWriter();
    }
}