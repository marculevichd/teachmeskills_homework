package com.example.teachmeskills_homework;

@FunctionalInterface
interface IChildToAdult<T, R> {
    R growChild(T child);
}