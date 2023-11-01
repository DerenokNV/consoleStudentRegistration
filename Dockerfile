# Базовый образ, содержащий Java 17
FROM openjdk:17-oracle

# Директория приложения внутри контейнера
WORKDIR /app

# Копирование JAR-файла в приложение в контейнер
COPY build/libs/consoleStudentRegistration-0.0.1-SNAPSHOT.jar app.jar

# Определим переменные среды
ENV INIT_ENABLE=true

# Команда для запуска приложения
CMD ["java", "-jar", "app.jar"]