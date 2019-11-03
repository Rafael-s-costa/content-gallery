package common

enum class EnumErrorCode(val errorCode: Int) {
    SUCCESS(1000),
    INTERNAL_ERROR(1001),
    EXTERNAL_ERROR(1002);
}