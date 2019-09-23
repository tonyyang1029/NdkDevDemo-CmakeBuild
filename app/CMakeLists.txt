cmake_minimum_required(VERSION 3.4.1)

add_library(NdkLib
            SHARED
            src/main/jni/NdkLib.c)

target_link_libraries(NdkLib
                      log)