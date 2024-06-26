package ru.dylev.filestorage.exception.repository;

/**
 * Exception produced by {@link ru.dylev.filestorage.repository.MinioRepository} when
 * {@link io.minio.MinioClient} throws any exception when trying to get list of objects.
 * This exception serves as wrapper for these exceptions.
 *
 * @see ru.dylev.filestorage.repository.MinioRepository
 * @see io.minio.MinioClient
 */
public class GetObjectsListException extends MinioRepositoryException {

    public GetObjectsListException(String message) {
        super(message);
    }

    public GetObjectsListException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetObjectsListException(Throwable cause) {
        super(cause);
    }
}
