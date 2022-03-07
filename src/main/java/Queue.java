/**
 * Класс структуры данных "Очередь"
 */
public class Queue {
    private Element<String> first;

    /**
     * Метод добавление элемента в очередь
     *
     * @param value значение добавляемого элемента в очередь
     */
    public void push(String value) {
        Element<String> newElement = new Element<>(value);
        if (first == null) {
            first = newElement;
        } else {
            Element<String> currentElement = first;
            while (currentElement.getNext() != null) {
                currentElement = currentElement.getNext();
            }
            currentElement.setNext(newElement);
        }
    }

    /**
     * Метод удаление первого элемента из очереди
     */
    public void pop() {
        first = first.getNext();
        Element<String> currentElement = first;
        while (currentElement.getNext() != null) {
            currentElement = currentElement.getNext();
        }
    }

    /**
     * Метод отображения очереди
     */
    public void print() {
        Element<String> currentElement = first;
        while (currentElement != null) {
            System.out.println(currentElement.getValue());
            currentElement = currentElement.getNext();
        }
    }
}
