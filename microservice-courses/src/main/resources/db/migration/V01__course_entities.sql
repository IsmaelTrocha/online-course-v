-- Crear la tabla COURSES
CREATE TABLE COURSES (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    tittle VARCHAR(255),
    description TEXT,
    language VARCHAR(255),
    createdBy VARCHAR(255) NOT NULL,
    creationDate DATETIME,
    price DOUBLE,
    have_discount boolean default false,
    level VARCHAR(255)
);

-- Crear la tabla COURSE_CONTENT
CREATE TABLE COURSE_CONTENT (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    course_id BIGINT,
    tittle VARCHAR(255),
    duration VARCHAR(255),
    FOREIGN KEY (course_id) REFERENCES COURSES(id)
);

-- Crear la tabla VIDEOS
CREATE TABLE VIDEOS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    code VARCHAR(255),
    duration INT,
    course_content_id BIGINT,
    FOREIGN KEY (course_content_id) REFERENCES COURSE_CONTENT(id)
);
