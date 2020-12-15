# Spring Bean Autowiring Modes

- **no** _(default)_
    - no autowiring. Bean references must be defined by ref elements

- **byName**
    - autowiring by property name. Spring looks for a bean with the same name as the property that needs to be autowired

- **byType**
    - lets a property be autowired if exactly one bean of the property type exists in the container 
    - if more than one exists, a fatal exception is thrown, which indicates that you may not use byType autowiring for that bean
    - if there are no matching beans, nothing happens (the property is not set)

- **constructor**
    - analogous to byType but applies to constructor arguments
    - if there is not exactly one bean of the constructor argument type in the container, a fatal error is raised.