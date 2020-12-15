# BeanFactory vs ApplicationContext

The `ApplicationContext` we know to be the primary implementation of the IOC container in Spring. Spring previously leveraged `BeanFactory` as the IOC container. Before defining the differences, we should highlight the relationship between the two. The `ApplicationContext` interface extends the `BeanFactory` interface. This means that the `ApplicationContext` is capable of everything that the `BeanFactory` is, and more. 

The key difference between the two relates to bean instantiation, which the `ApplicationContext` eagerly instantiating beans and the `BeanFactory` lazily instantiating beans by default. Other functionalities provided by the `ApplicationContext` include:

- Access to messages in i18n-style, through the `MessageSource` interface.

- Access to resources, such as URLs and files, through the `ResourceLoader` interface.

- Event publication, namely to beans that implement the `ApplicationListener` interface, through the use of the `ApplicationEventPublisher` interface.

- Loading of multiple (hierarchical) contexts, letting each be focused on one particular layer, such as the web layer of an application, through the `HierarchicalBeanFactory` interface.