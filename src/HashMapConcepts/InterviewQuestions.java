package HashMapConcepts;

public class InterviewQuestions {

    /*
    Q1. Can multiple thread write in the same segment?
    Ans: No. Thread acquires a lock on segment in put() operation and at a time only one thread can
    write in that segment.

    Q2. Can two threads write in the different segment?
    Ans: Yes. Two threads are allowed to write concurrently in different segments.

    Q3. Can multiple thread read from the same segment?
    Ans: Yes. Thread doesn't acquire a lock on segment in get() operation and any number of threads can
    read from the same segment.

    Q4. If one thread is writing in a segment, can another thread read from that segment?
    Yes. But in this case last updated value will be seen by the reading thread.

    Null keys and values:
    ConcurrentHashMap doesn't allow null keys and null values.
     */
}
