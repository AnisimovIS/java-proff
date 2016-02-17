
@FunctionalInterface
public interface ConverterInFace<F, T> {
    T convert(F from);

}
