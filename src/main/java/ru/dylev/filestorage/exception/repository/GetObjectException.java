package ru.dylev.filestorage.exception.repository;

/**
 * Exception produced by {@link ru.dylev.filestorage.repository.MinioRepository} when
 * {@link io.minio.MinioClient} throws any exception when trying to get an object.
 * This exception serves as wrapper for these exceptions.
 *
 * @see ru.dylev.filestorage.repository.MinioRepository
 * @see io.minio.MinioClient
 */
public class GetObjectException extends MinioRepositoryException {

    public GetObjectException(String message) {
        super(message);
    }

    public GetObjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetObjectException(Throwable cause) {
        super(cause);
    }
}
