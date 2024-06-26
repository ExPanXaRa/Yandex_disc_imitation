package ru.dylev.filestorage.exception.repository;

/**
 * Exception produced when {@link ru.dylev.filestorage.config.handlers.MinioBucketHandler} is unable
 * to create bucket and throws some exception. This exception serves as wrapper for these exceptions.
 *
 * @see ru.dylev.filestorage.config.handlers.MinioBucketHandler
 * @see MinioRepositoryException
 */
public class BucketInitException extends MinioRepositoryException {

    public BucketInitException(String message) {
        super(message);
    }

    public BucketInitException(String message, Throwable cause) {
        super(message, cause);
    }

    public BucketInitException(Throwable cause) {
        super(cause);
    }
}
