/**
 * A {@link LinkedStack} is a stack that is implemented using
 * a Linked List structure to allow for unbounded size.
 * <p></p>
 * The {@code isEmpty} and {@code size} methods are provided,
 * on the house.
 * @param <T> the elements stored in the stack
 */
public class LinkedStack<T> implements StackInterface<T> {

    Node<T> first;
    int size;

    /**
     * {@inheritDoc}.
     */
    @Override
    public T pop() {
        if(isEmpty()) {
            return null;
        } else {
            T data = first.getElement();
            first = first.getNext();
            size--;
            return data;
        }
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public T top() {
        if(isEmpty()) {
            return null;
        } else {
            return first.getElement();
        }
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public void push(T elem) throws NullPointerException {
        if (elem == null) {
            throw new NullPointerException("Cannot add a null element to the stack");
        } else {
            Node<T> newNode = new Node<>(elem);
            newNode.setNext(first);
            first = newNode;
            size++;
        }
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public int size() {
        return size;
    }
}