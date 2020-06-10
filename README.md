```
Fiber failed.
An unchecked error was produced.
zio.query.QueryFailure: Data source AddressSource did not complete request GetAddress(111).

Fiber:Id(1591798409621,12) was supposed to continue to: <empty trace>

Fiber:Id(1591798409621,12) execution trace:
  at zio.query.internal.Continue$.apply(Continue.scala:134)
  at zio.ZRef$Atomic.get(ZRef.scala:201)

Fiber:Id(1591798409621,12) was spawned by:

Fiber:Id(1591798409589,10) was supposed to continue to: <empty trace>

Fiber:Id(1591798409589,10) ZIO Execution trace: <empty trace>

Fiber:Id(1591798409589,10) was spawned by:

Fiber:Id(1591798407369,0) was supposed to continue to:
  a future continuation at zio.ZIO.zipWithPar(ZIO.scala:2002)
  a future continuation at Main$.result(Main.scala:40)
  a future continuation at zio.query.ZQuery.zipWithPar(ZQuery.scala:371)
  a future continuation at Main$.result(Main.scala:44)
  a future continuation at zio.query.ZQuery.runLog(ZQuery.scala:272)
  a future continuation at zio.query.ZQuery.run(ZQuery.scala:251)
  a future continuation at Main$.new(Main.scala:46)

Fiber:Id(1591798407369,0) execution trace:
  at zio.ZIO.zipWithPar(ZIO.scala:2001)
  at zio.ZIO$.fiberId(ZIO.scala:2535)
  at zio.ZIO$.descriptor(ZIO.scala:2319)
  at zio.query.ZQuery.runCache(ZQuery.scala:259)
  at zio.ZIO$.foreach_(ZIO.scala:2640)
  at zio.ZIO$.foreachPar_(ZIO.scala:2767)
  at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:155)
  at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:148)
  at zio.ZIO$.effectSuspendTotal(ZIO.scala:2490)
  at zio.ZIO$.bracketExit(ZIO.scala:2129)

Fiber:Id(1591798407369,0) was spawned by: <empty trace>
Fiber failed.
An unchecked error was produced.
zio.query.QueryFailure: Data source PaymentSource did not complete request GetPayment(222).

Fiber:Id(1591798409608,11) was supposed to continue to: <empty trace>

Fiber:Id(1591798409608,11) execution trace:
  at zio.query.internal.Continue$.apply(Continue.scala:134)
  at zio.ZRef$Atomic.get(ZRef.scala:201)

Fiber:Id(1591798409608,11) was spawned by:

Fiber:Id(1591798409589,10) was supposed to continue to: <empty trace>

Fiber:Id(1591798409589,10) ZIO Execution trace: <empty trace>

Fiber:Id(1591798409589,10) was spawned by:

Fiber:Id(1591798407369,0) was supposed to continue to:
  a future continuation at zio.ZIO.zipWithPar(ZIO.scala:2002)
  a future continuation at Main$.result(Main.scala:40)
  a future continuation at zio.query.ZQuery.zipWithPar(ZQuery.scala:371)
  a future continuation at Main$.result(Main.scala:44)
  a future continuation at zio.query.ZQuery.runLog(ZQuery.scala:272)
  a future continuation at zio.query.ZQuery.run(ZQuery.scala:251)
  a future continuation at Main$.new(Main.scala:46)

Fiber:Id(1591798407369,0) execution trace:
  at zio.ZIO.zipWithPar(ZIO.scala:2001)
  at zio.ZIO$.fiberId(ZIO.scala:2535)
  at zio.ZIO$.descriptor(ZIO.scala:2319)
  at zio.query.ZQuery.runCache(ZQuery.scala:259)
  at zio.ZIO$.foreach_(ZIO.scala:2640)
  at zio.ZIO$.foreachPar_(ZIO.scala:2767)
  at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:155)
  at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:148)
  at zio.ZIO$.effectSuspendTotal(ZIO.scala:2490)
  at zio.ZIO$.bracketExit(ZIO.scala:2129)

Fiber:Id(1591798407369,0) was spawned by: <empty trace>
Fiber failed.
╥
╠══╦══╗
║  ║  ║
║  ║  ╠─An unchecked error was produced.
║  ║  ║ zio.query.QueryFailure: Data source AddressSource did not complete request GetAddress(111).
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409621,12) was supposed to continue to: <empty trace>
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409621,12) execution trace:
║  ║  ║   at zio.query.internal.Continue$.apply(Continue.scala:134)
║  ║  ║   at zio.ZRef$Atomic.get(ZRef.scala:201)
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409621,12) was spawned by:
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409589,10) was supposed to continue to: <empty trace>
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409589,10) ZIO Execution trace: <empty trace>
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409589,10) was spawned by:
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798407369,0) was supposed to continue to:
║  ║  ║   a future continuation at zio.ZIO.zipWithPar(ZIO.scala:2002)
║  ║  ║   a future continuation at Main$.result(Main.scala:40)
║  ║  ║   a future continuation at zio.query.ZQuery.zipWithPar(ZQuery.scala:371)
║  ║  ║   a future continuation at Main$.result(Main.scala:44)
║  ║  ║   a future continuation at zio.query.ZQuery.runLog(ZQuery.scala:272)
║  ║  ║   a future continuation at zio.query.ZQuery.run(ZQuery.scala:251)
║  ║  ║   a future continuation at Main$.new(Main.scala:46)
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798407369,0) execution trace:
║  ║  ║   at zio.ZIO.zipWithPar(ZIO.scala:2001)
║  ║  ║   at zio.ZIO$.fiberId(ZIO.scala:2535)
║  ║  ║   at zio.ZIO$.descriptor(ZIO.scala:2319)
║  ║  ║   at zio.query.ZQuery.runCache(ZQuery.scala:259)
║  ║  ║   at zio.ZIO$.foreach_(ZIO.scala:2640)
║  ║  ║   at zio.ZIO$.foreachPar_(ZIO.scala:2767)
║  ║  ║   at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:155)
║  ║  ║   at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:148)
║  ║  ║   at zio.ZIO$.effectSuspendTotal(ZIO.scala:2490)
║  ║  ║   at zio.ZIO$.bracketExit(ZIO.scala:2129)
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798407369,0) was spawned by: <empty trace>
║  ║  ▼
║  ║
║  ╠─An unchecked error was produced.
║  ║ zio.query.QueryFailure: Data source PaymentSource did not complete request GetPayment(222).
║  ║ 
║  ║ Fiber:Id(1591798409608,11) was supposed to continue to: <empty trace>
║  ║ 
║  ║ Fiber:Id(1591798409608,11) execution trace:
║  ║   at zio.query.internal.Continue$.apply(Continue.scala:134)
║  ║   at zio.ZRef$Atomic.get(ZRef.scala:201)
║  ║ 
║  ║ Fiber:Id(1591798409608,11) was spawned by:
║  ║ 
║  ║ Fiber:Id(1591798409589,10) was supposed to continue to: <empty trace>
║  ║ 
║  ║ Fiber:Id(1591798409589,10) ZIO Execution trace: <empty trace>
║  ║ 
║  ║ Fiber:Id(1591798409589,10) was spawned by:
║  ║ 
║  ║ Fiber:Id(1591798407369,0) was supposed to continue to:
║  ║   a future continuation at zio.ZIO.zipWithPar(ZIO.scala:2002)
║  ║   a future continuation at Main$.result(Main.scala:40)
║  ║   a future continuation at zio.query.ZQuery.zipWithPar(ZQuery.scala:371)
║  ║   a future continuation at Main$.result(Main.scala:44)
║  ║   a future continuation at zio.query.ZQuery.runLog(ZQuery.scala:272)
║  ║   a future continuation at zio.query.ZQuery.run(ZQuery.scala:251)
║  ║   a future continuation at Main$.new(Main.scala:46)
║  ║ 
║  ║ Fiber:Id(1591798407369,0) execution trace:
║  ║   at zio.ZIO.zipWithPar(ZIO.scala:2001)
║  ║   at zio.ZIO$.fiberId(ZIO.scala:2535)
║  ║   at zio.ZIO$.descriptor(ZIO.scala:2319)
║  ║   at zio.query.ZQuery.runCache(ZQuery.scala:259)
║  ║   at zio.ZIO$.foreach_(ZIO.scala:2640)
║  ║   at zio.ZIO$.foreachPar_(ZIO.scala:2767)
║  ║   at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:155)
║  ║   at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:148)
║  ║   at zio.ZIO$.effectSuspendTotal(ZIO.scala:2490)
║  ║   at zio.ZIO$.bracketExit(ZIO.scala:2129)
║  ║ 
║  ║ Fiber:Id(1591798407369,0) was spawned by: <empty trace>
║  ▼
▼
Fiber failed.
╥
╠══╦══╗
║  ║  ║
║  ║  ╠─An unchecked error was produced.
║  ║  ║ zio.query.QueryFailure: Data source AddressSource did not complete request GetAddress(111).
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409621,12) was supposed to continue to: <empty trace>
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409621,12) execution trace:
║  ║  ║   at zio.query.internal.Continue$.apply(Continue.scala:134)
║  ║  ║   at zio.ZRef$Atomic.get(ZRef.scala:201)
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409621,12) was spawned by:
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409589,10) was supposed to continue to: <empty trace>
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409589,10) ZIO Execution trace: <empty trace>
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409589,10) was spawned by:
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798407369,0) was supposed to continue to:
║  ║  ║   a future continuation at zio.ZIO.zipWithPar(ZIO.scala:2002)
║  ║  ║   a future continuation at Main$.result(Main.scala:40)
║  ║  ║   a future continuation at zio.query.ZQuery.zipWithPar(ZQuery.scala:371)
║  ║  ║   a future continuation at Main$.result(Main.scala:44)
║  ║  ║   a future continuation at zio.query.ZQuery.runLog(ZQuery.scala:272)
║  ║  ║   a future continuation at zio.query.ZQuery.run(ZQuery.scala:251)
║  ║  ║   a future continuation at Main$.new(Main.scala:46)
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798407369,0) execution trace:
║  ║  ║   at zio.ZIO.zipWithPar(ZIO.scala:2001)
║  ║  ║   at zio.ZIO$.fiberId(ZIO.scala:2535)
║  ║  ║   at zio.ZIO$.descriptor(ZIO.scala:2319)
║  ║  ║   at zio.query.ZQuery.runCache(ZQuery.scala:259)
║  ║  ║   at zio.ZIO$.foreach_(ZIO.scala:2640)
║  ║  ║   at zio.ZIO$.foreachPar_(ZIO.scala:2767)
║  ║  ║   at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:155)
║  ║  ║   at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:148)
║  ║  ║   at zio.ZIO$.effectSuspendTotal(ZIO.scala:2490)
║  ║  ║   at zio.ZIO$.bracketExit(ZIO.scala:2129)
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798407369,0) was spawned by: <empty trace>
║  ║  ▼
║  ║
║  ╠─An unchecked error was produced.
║  ║ zio.query.QueryFailure: Data source PaymentSource did not complete request GetPayment(222).
║  ║ 
║  ║ Fiber:Id(1591798409608,11) was supposed to continue to: <empty trace>
║  ║ 
║  ║ Fiber:Id(1591798409608,11) execution trace:
║  ║   at zio.query.internal.Continue$.apply(Continue.scala:134)
║  ║   at zio.ZRef$Atomic.get(ZRef.scala:201)
║  ║ 
║  ║ Fiber:Id(1591798409608,11) was spawned by:
║  ║ 
║  ║ Fiber:Id(1591798409589,10) was supposed to continue to: <empty trace>
║  ║ 
║  ║ Fiber:Id(1591798409589,10) ZIO Execution trace: <empty trace>
║  ║ 
║  ║ Fiber:Id(1591798409589,10) was spawned by:
║  ║ 
║  ║ Fiber:Id(1591798407369,0) was supposed to continue to:
║  ║   a future continuation at zio.ZIO.zipWithPar(ZIO.scala:2002)
║  ║   a future continuation at Main$.result(Main.scala:40)
║  ║   a future continuation at zio.query.ZQuery.zipWithPar(ZQuery.scala:371)
║  ║   a future continuation at Main$.result(Main.scala:44)
║  ║   a future continuation at zio.query.ZQuery.runLog(ZQuery.scala:272)
║  ║   a future continuation at zio.query.ZQuery.run(ZQuery.scala:251)
║  ║   a future continuation at Main$.new(Main.scala:46)
║  ║ 
║  ║ Fiber:Id(1591798407369,0) execution trace:
║  ║   at zio.ZIO.zipWithPar(ZIO.scala:2001)
║  ║   at zio.ZIO$.fiberId(ZIO.scala:2535)
║  ║   at zio.ZIO$.descriptor(ZIO.scala:2319)
║  ║   at zio.query.ZQuery.runCache(ZQuery.scala:259)
║  ║   at zio.ZIO$.foreach_(ZIO.scala:2640)
║  ║   at zio.ZIO$.foreachPar_(ZIO.scala:2767)
║  ║   at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:155)
║  ║   at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:148)
║  ║   at zio.ZIO$.effectSuspendTotal(ZIO.scala:2490)
║  ║   at zio.ZIO$.bracketExit(ZIO.scala:2129)
║  ║ 
║  ║ Fiber:Id(1591798407369,0) was spawned by: <empty trace>
║  ▼
▼
Exception in thread "main" zio.FiberFailure: Fiber failed.
╥
╠══╦══╗
║  ║  ║
║  ║  ╠─An unchecked error was produced.
║  ║  ║ zio.query.QueryFailure: Data source AddressSource did not complete request GetAddress(111).
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409621,12) was supposed to continue to: <empty trace>
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409621,12) execution trace:
║  ║  ║   at zio.query.internal.Continue$.apply(Continue.scala:134)
║  ║  ║   at zio.ZRef$Atomic.get(ZRef.scala:201)
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409621,12) was spawned by:
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409589,10) was supposed to continue to: <empty trace>
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409589,10) ZIO Execution trace: <empty trace>
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798409589,10) was spawned by:
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798407369,0) was supposed to continue to:
║  ║  ║   a future continuation at zio.ZIO.zipWithPar(ZIO.scala:2002)
║  ║  ║   a future continuation at Main$.result(Main.scala:40)
║  ║  ║   a future continuation at zio.query.ZQuery.zipWithPar(ZQuery.scala:371)
║  ║  ║   a future continuation at Main$.result(Main.scala:44)
║  ║  ║   a future continuation at zio.query.ZQuery.runLog(ZQuery.scala:272)
║  ║  ║   a future continuation at zio.query.ZQuery.run(ZQuery.scala:251)
║  ║  ║   a future continuation at Main$.new(Main.scala:46)
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798407369,0) execution trace:
║  ║  ║   at zio.ZIO.zipWithPar(ZIO.scala:2001)
║  ║  ║   at zio.ZIO$.fiberId(ZIO.scala:2535)
║  ║  ║   at zio.ZIO$.descriptor(ZIO.scala:2319)
║  ║  ║   at zio.query.ZQuery.runCache(ZQuery.scala:259)
║  ║  ║   at zio.ZIO$.foreach_(ZIO.scala:2640)
║  ║  ║   at zio.ZIO$.foreachPar_(ZIO.scala:2767)
║  ║  ║   at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:155)
║  ║  ║   at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:148)
║  ║  ║   at zio.ZIO$.effectSuspendTotal(ZIO.scala:2490)
║  ║  ║   at zio.ZIO$.bracketExit(ZIO.scala:2129)
║  ║  ║ 
║  ║  ║ Fiber:Id(1591798407369,0) was spawned by: <empty trace>
║  ║  ▼
║  ║
║  ╠─An unchecked error was produced.
║  ║ zio.query.QueryFailure: Data source PaymentSource did not complete request GetPayment(222).
║  ║ 
║  ║ Fiber:Id(1591798409608,11) was supposed to continue to: <empty trace>
║  ║ 
║  ║ Fiber:Id(1591798409608,11) execution trace:
║  ║   at zio.query.internal.Continue$.apply(Continue.scala:134)
║  ║   at zio.ZRef$Atomic.get(ZRef.scala:201)
║  ║ 
║  ║ Fiber:Id(1591798409608,11) was spawned by:
║  ║ 
║  ║ Fiber:Id(1591798409589,10) was supposed to continue to: <empty trace>
║  ║ 
║  ║ Fiber:Id(1591798409589,10) ZIO Execution trace: <empty trace>
║  ║ 
║  ║ Fiber:Id(1591798409589,10) was spawned by:
║  ║ 
║  ║ Fiber:Id(1591798407369,0) was supposed to continue to:
║  ║   a future continuation at zio.ZIO.zipWithPar(ZIO.scala:2002)
║  ║   a future continuation at Main$.result(Main.scala:40)
║  ║   a future continuation at zio.query.ZQuery.zipWithPar(ZQuery.scala:371)
║  ║   a future continuation at Main$.result(Main.scala:44)
║  ║   a future continuation at zio.query.ZQuery.runLog(ZQuery.scala:272)
║  ║   a future continuation at zio.query.ZQuery.run(ZQuery.scala:251)
║  ║   a future continuation at Main$.new(Main.scala:46)
║  ║ 
║  ║ Fiber:Id(1591798407369,0) execution trace:
║  ║   at zio.ZIO.zipWithPar(ZIO.scala:2001)
║  ║   at zio.ZIO$.fiberId(ZIO.scala:2535)
║  ║   at zio.ZIO$.descriptor(ZIO.scala:2319)
║  ║   at zio.query.ZQuery.runCache(ZQuery.scala:259)
║  ║   at zio.ZIO$.foreach_(ZIO.scala:2640)
║  ║   at zio.ZIO$.foreachPar_(ZIO.scala:2767)
║  ║   at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:155)
║  ║   at zio.internal.FiberContext$InterruptExit$.apply(FiberContext.scala:148)
║  ║   at zio.ZIO$.effectSuspendTotal(ZIO.scala:2490)
║  ║   at zio.ZIO$.bracketExit(ZIO.scala:2129)
║  ║ 
║  ║ Fiber:Id(1591798407369,0) was spawned by: <empty trace>
║  ▼
▼

Process finished with exit code 1
```
