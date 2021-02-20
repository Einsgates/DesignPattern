# 设计模式

## 1.分类



1. 创建者模式

   **提供了一种在创建对象时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。**

   - [工厂模式 Factory Pattern](https://github.com/Einsgates/DesignPattern/blob/master/Factory%20Pattern/%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F.md)
   - [抽象工厂模式 Abstract Factory Pattern](https://github.com/Einsgates/DesignPattern/blob/master/Abstract%20Factory%20Pattern/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F.md)
   - [单例模式 Singleton Pattern](https://github.com/Einsgates/DesignPattern/blob/master/Singleton%20Pattern/%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F.md)
   - [建造者模式 Builder Pattern](https://github.com/Einsgates/DesignPattern/blob/master/Builder%20Pattern/%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F.md)
   - 原型模式 Prototype Pattern

2. 结构型模式

   **关注类和对象的组合。继承的概念用来组合接口和定义组合对象获得新功能的方式**

   - 适配器模式 Adapter Pattern
   - 桥接模式 Bridge Pattern
   - 过滤器模式 Filter/Criteria Pattern
   - 组合模式 Composite Pattern
   - 装饰器模式 Decorator Pattern
   - 外观模式 Facade Pattern
   - 享元模式 Flyweight Pattern
   - 代理模式 Proxy Pattern

3. 行为型模式

   **关注对象之间的通信**

   - 责任链模式 Chain of Responsibility Pattern
   - 命令模式 Command Pattern
   - 解释器模式 Interpreter Pattern
   - 迭代器模式 Iterator Pattern
   - 中介者模式 Mediator Pattern
   - 备忘录模式 Memento Pattern
   - 观察者模式 Observer Pattern
   - 状态模式 State Pattern
   - 空对象模式 Null Object Pattern
   - 策略模式 Strategy Pattern
   - 模板模式 Template Pattern
   - 受访者模式 Visitor Pattern

4. J2EE模式

   **关注表示层**

   - MVC 模式 MVC Pattern
   - 业务代表模式 Business Delegate Pattern
   - 组合实体模式 Composite Entity Pattern
   - 数据访问模式 Data Access Object Pattern
   - 前端控制模式 Front Controller Pattern
   - 拦截过滤模式 Intercepting Filter Pattern
   - 服务定位器模式 Service Locator Pattern
   - 传输对象模式 Transfer Object Pattern

5. 各模式关系
![image](https://github.com/Einsgates/DesignPattern/blob/master/photos/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E4%B9%8B%E9%97%B4%E5%85%B3%E7%B3%BB.png)

## 2.设计原则

1. 开闭原则

   对扩展开放，对修改关闭

2. 里氏代换原则

   任何基类出现的地方，子类一定可以出现

3. 依赖倒转原则

   针对接口编程，依赖于抽象而不是具体

4. 接口隔离原则

   使用多个隔离的接口，比使用单个接口好，即降低类之间的耦合度

5. 迪米特法则

   即最少知道原则，一个实体应当尽量少与其他实体发生相互作用，使得系统功能模块相对独立

6. 合成复用原则

   尽量使用合成/聚合的方式，而不是使用继承。
