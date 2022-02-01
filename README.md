# SigurExApp

I. Существуют следующие сущности:
1. Cущность Employee. Сущность имеет следующие поля:
- ID – уникальный целочисленный идентификатор.
- HIRE_TIME — дата и время принятия сотрудника на работу.
- FIRED_TIME – дата и время "увольнения" сотрудника.
- DEPARTMENT_ID – идентификатор отдела, в котором он состоит.
2. Department – отдел, в котором работает сотрудник (Employee). Сущность имеет
следующие поля:
– ID — уникальный числовой идентификатор отдела.
– NAME — имя, может содержать кириллицу. Не превышает 32 символов в длину.
По умолчанию должно существовать некоторое количество отделов, скажем, 10 штук. Их
число должно оставаться постоянным даже при нескольких запусках приложения.

II. Первый компонент — EmployeesMgr.
EmployeesMgr генерирует сотрудников, т. е. "нанимает на работу" новых сотрудников с
некоторой частотой, например каждую секунду. Каждая новая итерация (каждая секунда)
будет означать новый день, т. е. каждая итерация это +1 день к предыдущему. Будем называть
данное время виртуальным. Нулевая итерация означает 1 января 2022 года. Последняя
итерация это 31 декабря 2022 года.
- Время найма (HIRE_TIME) сотрудника на работу должно быть случайным и находиться в
пределах "от текущего виртуального дня" и до конца виртуального периода (31 декабря 2022
года).
- CARD должен быть случайным, но уникальным среди всех сущностей Employee.
- Идентификатор отдела DEPARTMENT_ID должен быть случайным и равен одному из
заранее созданных сущностей Department.
- Каждый 5-ый найм "увольняет" случайное число сотрудников (от 1 до 3). Таким образом,
проставляется дата и время FIRED_TIME. Также является виртуальным временем.
- Информация о произведённых наймах и увольнениях должна быть отражена в базе данных.

III. Второй компонент EmployeeHireLogger – логгирует найм и увольнение сотрудников,
произведенных EmployeesMgr.
- Данный компонент должен работать "параллельно" компоненту EmployeesMgr и не мешать
процессу найма и увольнения.
- Компонент EmployeeHireLogger не имеет доступа к базе данных, в отличие от
EmployeesMgr.
- Все наймы и увольнения сотрудников логгируются в консоли в виде:
- {Дата текущего дня, отсчитываемого компонентом (виртуальное время)}. Сотрудник
{идентификатор сотрудника} нанят {дата и время найма (виртуальное время)}. Отдел: {имя
отдела сотрудника}.
- {Дата текущего дня, отсчитываемого компонентом (виртуальное время)}. Сотрудник {идентификатор сотрудника} уволен {дата и время увольнения (виртуальное время)}. Отдел:
{имя отдела сотрудника}. Проработал: {количество дней, проведённых в штате (кол-во дней
между наймом и увольнением виртуального времени)}.
