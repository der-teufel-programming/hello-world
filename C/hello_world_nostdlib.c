long write(long fd, void* data, long len) {
    long a = 1;
    __asm__ __volatile__ ("syscall":"+a"(a):"D"(fd),"S"(data),"d"(len):"rcx","r11");
    return a;
}

void exit(long status) {
    __asm__ __volatile__ ("syscall"::"a"(60),"D"(status):"rsi","rdx","rcx","r11");
}

int _start() {
    write(1, "Hello, world!\n", 14);
    exit(0);
}
