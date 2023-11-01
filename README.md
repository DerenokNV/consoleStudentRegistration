# consoleStudentRegistration
консольное приложение «Учет студентов» (spring shell docker)

Для просмотра всех имеющихся контактов: print  
Для ввода Студента в приложение: add --f Фамилия --n Имя --а Возраст  
Для удаления Студента по id: delete --id IdСтудента  
Для удаления всего списка: deleteAll  
Для создавать студентов при старте приложения: указать в пропертях app.init-student.enable:true  
Для запуска в Docker контейнере:  
 собрать   docker build -t student .  
 запустить docker run -it -p 5432:5432 student  
