## UML

业务场景:
pending → running → success | failed

```mermaid
classDiagram
    class State {
        <<interface>>
        +execute(context: Context): void
    }
    class PendingState {
        +execute(context: Context): void
    }
    class RunningState {
        +execute(context: Context): void
    }
    class SuccessState {
        +execute(context: Context): void
    }
    class FailedState {
        +execute(context: Context): void
    }
    class Context {
        -state: State
        +changeState(state: State): void
        +execute(): void
    }
    State <|.. PendingState
    State <|.. RunningState
    State <|.. SuccessState
    State <|.. FailedState
    State ..> Context
    Context o-- State
```


# References
* https://refactoringguru.cn/design-patterns/state
* https://github.com/Sayi/sayi.github.com/issues/70
* https://zhuanlan.zhihu.com/p/676913583