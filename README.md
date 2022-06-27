- Все проверки разбиты по классам в соответствии с проверяемым функционалом: **AdditionTests**, **ConstructorReductionTests**, **ConstructorSimpleTests**, **DivisionTests**, **EqualityTests**, **ExceptionTests**, **LessOrEqualTests**, **LessTests**, **MultiplicationTests**, **SelfOperationTests**, **SubtractionTests** 
- Инструкция к запуску:
    - Перейти в src/test
    - В отдельном файле(классе) содержатся проверки, проверяющие одну функциональность класса
    - Необходимо открыть один из файлов. 
    - Нажатием Run можно запустить весь тестовый класс, содержащийся в выбранном файле.


## Баг-репорт:
- В классе LessTests падает тест _(testStrictInequalityHoldsForPositive)_. 
    - Что проверяет: для чисел A<B метод less должен возвращать True.
    - Результат: для чисел 2 и 7/2 (=3.5) метод возвращает False.
    - Возможная причина: ошибка в реализации метода less в тестируемом классе Rational. В последнем условном блоке в формуле используется getNumerator() без указания rational.

- В классе LessOrEqualTests падает тест _(testGreaterNotLessOrEqualLesser)_. 
    - Что проверяет: для положительных чисел A>B метод lessOrEqual должен возвращать False
    - Результат: для 9/8 и 4/7 возвращает True.
    - Возможная причина: less or equals ссылается на метод less, в котором ошибка.

## Чек-лист проверок:

#### AdditionTests: _проверки сложения двух чисел_
1) Ноль плюс ноль 
2) Ноль плюс не ноль 
3) Не ноль плюс ноль
4) Положительное плюс положительное 
5) Положительное плюс отрицательное 
6) Отрицательное плюс положительное 
7) Отрицательное плюс отрицательное 

#
#### ConstructorReductionTests: _проверки упрощения дробей конструктором (сокращение и переброс знака)_
1) Если знаменатель отрицательный, то минус перейдет в числитель
2) Если числитель нулевой, то знаменатель сокращается до 1
3) Для положительных чисел: если числитель и знаменатель имеют общий делитель, то дробь сократится
4) Для отрицательных чисел: если числитель и знаменатель имеют общий делитель, то дробь сократится

#
#### ConstructorTests: _проверки корректной инициализации дробей констуктором_
1) Нулевой числитель
2) Положительные числитель и знаменатель
3) Отрицательные числитель и знаменатель
4) Положительный числитель и отрицательный знаменатель
5) Отрицательный числитель и положительный знаменатель

#
#### DivisionTests: _проверки деления двух чисел_
1) Ноль на положительное
2) Ноль на отрицательное
3) Положительное на положительное
4) Положительное на отрицательное
5) Отрицательное на положительное
6) Отрицательное на отрицательное

#
#### EqualityTests: _проверки сравнения "=" между числами_
1) Ноль равен нулю 
2) Отрицательное равно самому себе 
3) Положительное равно самому себе 
4) Числа разных знаков не равны
5) Разные положительные числа не равны 
6) Разные отрицательные числа не равны
7) Объект Rational не равен Null? (equals может принимать на вход элементы Object)
8) Сравнение Rational с другими классами

#
#### ExceptionTests: _проверки появления заданных исключений в случаях внештатных ситуаций_
1) Инициализация дроби с нулевым знаменателем.
2) Положительное делим на ноль
3) Отрицательное делим на ноль
4) Ноль делим на ноль (нули в виде двух объектов)
5) Ноль делим на сам себя (ноль в виде одного объекта)

#
#### LessOrEqualTests: _проверки сравнения "<=" между числами_
1) Неравенство выполняется для положительных A<=B
2) Неравенство выполняется для отрицательных A<=B
3) Неравенство выполняется для A<=B, где A,B -- разных знаков
4) Ноль меньше либо равен нуля
5) Положительное число меньше либо равно себя 
6) Отрицательное число меньше либо равно себя
7) Большее число не меньше либо равно меньшего


#
#### LessTests: _проверки сравнения "<" между числами_
1) Неравенство выполняется для положительных A<B
2) Неравенство выполняется для отрицательных A<B
3) Неравенство выполняется для A<B, где A,B -- разных знаков
4) Ноль не может быть меньше нуля 
5) Положительное число не может быть меньше себя 
6) Отрицательное число не может быть меньше себя 
7) Большее число не может быть меньше меньшего


#
#### MultiplicationTests: _проверки умножения двух чисел_
1) Ноль умножает ноль 
2) Ноль умножает не ноль 
3) Не ноль умножает ноль 
4) Положительное умножает положительное 
5) Положительное умножает отрицательное 
6) Отрицательное умножает положительное 
7) Отрицательное умножает отрицательное 

#
#### SelfOperationTests: _проверки методов объекта, в которые отправляем сам объект_
1) Сумма с самим собой
2) Разность с самим собой
3) Равенство самому себе
4) Строгое неравенство с самим собой
5) Нестрогое неравенство с самим собой
6) Деление на себя
7) Умножение на себя
8) Проверка стандартного конструктора (это особый тест, который никуда не вписывался, поэтому он здесь)

#
#### SubtractionTests: _проверки разности двух чисел_
1) Ноль минус ноль 
2) Ноль минус не ноль 
3) Не ноль минус ноль
4) Положительное минус положительное 
5) Положительное минус отрицательное 
6) Отрицательное минус положительное 
7) Отрицательное минус отрицательное 











