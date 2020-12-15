# Spring Bean Lifecycle

## Explanation

Spring's bean factory is responsible for managing the lifecycle of beans created through the Spring container. The lifecycle of beans consist of call back methods which can be categorized broadly in two groups:

- Post initialization call back methods
- Pre destruction call back methods

## Lifecycle Diagram

![Spring Bean Lifecycle Callback Methods](https://cdn1.howtodoinjava.com/wp-content/uploads/Spring-bean-life-cycle.png)

## Lifecycle Breakdown

1) Instantiation
    - Bean is instantiated


2) Populate Properties
    - Bean dependencies are injected


3) `BeanNameAware.setBeanName()`
    - Set the name of the bean in the container


4) `BeanFactoryAware.setBeanFactory()`
    - Callback that supplies the owning factory to a bean instance


5) Pre-initialization BeanPostProcessors
    - validates that the bean was creating correctly _before_ invoking its initialization method(s)

6) `InitializingBean.afterPropertiesSet()`
    - invoked by the container on the bean after the container and bean are aware of one another


7) Custom init-method
    - can be used to call some custom business logic methods (setting up resources - DB, sockets, etc.)


8) Post-initialization BeanPostProcessors
    - validates that the bean was creating correctly _after_ invoking its initialization method(s)


9) At this time the bean is ready to use


10) At some point the container will begin its shut down process


11) `DisposableBean.destroy()`
    - invoked by the container on the bean to prepare it for destruction


12) Custom destroy-method
    - can be used to call some custom business logic methods (tearing down resources - DB, sockets, etc.)