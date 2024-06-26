package ru.dylev.filestorage.exception.repository;

/**
 * Exception produced by {@link ru.dylev.filestorage.repository.MinioRepository} when
 * {@link io.minio.MinioClient} throws any exception when trying to delete an object.
 * This exception serves as wrapper for these exceptions.
 *
 * @see ru.dylev.filestorage.repository.MinioRepository
 * @see io.minio.MinioClient
 */
public class DeleteObjectException extends MinioRepositoryException {

    public DeleteObjectException(String message) {
        super(message);
    }

    public DeleteObjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeleteObjectException(Throwable cause) {
        super(cause);
    }
}
