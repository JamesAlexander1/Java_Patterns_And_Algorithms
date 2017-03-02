package factory;

public interface IFactoryProducer<E> {

	AbstractSortFactory<E> getFactory(String name);
}
