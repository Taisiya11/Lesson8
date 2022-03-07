/**
 * Класс структуры данных "Стек"
 */
public class Stack {
    private Element<Integer> first;

    /**
     * Метод добавление элемента в стек
     *
     * @param value значение добавляемого элемента в стек
     */
    public void push(int value) {
        Element<Integer> newElement = new Element<>(value);
        if (first == null) {
            first = newElement;
        } else {
            if (first.getNext() == null) {
                newElement.setNext(first);
                first = newElement;
            } else {
                Element<Integer> currentElement = first;
                while (currentElement.getNext() != null) {
                    newElement.setNext(first);
                    currentElement = currentElement.getNext();
                }
                first = newElement;
            }
        }
    }

    /**
     * Метод удаление первого элемента из стека
     */
    public void pop() {
        first = first.getNext();
        Element<Integer> currentElement = first;
        while (currentElement.getNext() != null) {
            currentElement = currentElement.getNext();
        }
    }


    /**
     * Метод отображения стека
     */
    public void print() {
        Element<Integer> currentElement = first;
        while (currentElement != null) {
            System.out.println(currentElement.getValue());
            currentElement = currentElement.getNext();
        }
    }
}
