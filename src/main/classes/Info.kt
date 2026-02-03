package main.classes

/**
 *
 * @Target tells you where this annotation must be used
 * @Retention controls how long an annotation exists.
 */
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY
)
@Retention(AnnotationRetention.RUNTIME)
annotation class Info(
    val author: String,
    val version: String
)
