# Hibernate

Hibernate is an Object Relational Mapper for Java Applications.

It allows us to perform SQL Operations against a database in an *Object-Oriented way*.
Classes in Java get mapped to Tables in the DB.
Objects in Java get mapped to records in those tables.

HAS-A relationships (such as fields in your class) become foreign keys in the DB.

Hibernate follows JPA (Java Persistence API). Hibernate was originally written without following the JPA, and then re-written later.
Due to this, many interfaces can be imported from both Hibernate as well as JPA packages. We will primarily use the JPA interfaces.

## JPA

- @Entity
    - Applied to your class
    - Defines the class to be tracked by Hibernate
    - Terminology that Hibernate uses to describe classes mapped to a DB
- @Table
    - Allows us to define the table name that the class gets mapped to
    - Is optional, if not used, the table name will match the class name (but lowercase)
- @Id
    - Defines which field will act as the primary key of the table
- @GeneratedValue
    - Used in conjunction with @Id, to automatically generate Primary Key values
- @Column
    - Optional, Fields will already become columns, without needing the annotation
    - Allows us to define the column name that specific fields will use
    - This just allows us to change the name
- Mapping annotations
    - @OneToOne
    - @OneToMany or @ManyToOne
    - @ManyToMany
    - @JoinColumn or @JoinTable
    - All of which are used to configure the relationships between tables
- etc

Alternatively, Hibernate used xml configuration. So we do not have to use these annotations if we didn't to. However, the annotations are really great, so most of the time, we will use them.

We will use an xml configuration file (hibernate.cfg.xml)

## API

- Session (Interface)
    - Represents a "session" with the database
    - It may last longer than a single JDBC connection, or it might be shorter
- SessionFactory (Interface)
    - Used to build sessions (obtained from Configuration object)
- Configuration (Class)
    - Represents the information in the hibernate.cfg.xml file
- Transaction (Interface)
    - Represents a transaction within the DB

## Caching

Hibernate uses several caches to provide optimizations fr our SQL operations
- Ex: If we were to perform several update operations in a row, Hibernate can track all of the changes and execute
    all at once as a single update with the resulting values.

There are different levels of caches in Hibernate
- L1 cache
    - Built in and provided for us automatically
    - Scoped to a single Session
- L2 cache
    - Not built in or provided, but we can add it in to the project
        - Does not come with Hibernate
        - Will need some other library
    - Scoped to a SessionFactory
    - Optimizations can be performed across mutliple sessions
        - However, these optimizations become very complex

## Object/Entity States

Objects are synchronized with the DB through Hibernate sessions and therefore can have different states depending on when/if they are currently synchronized.

- Transient
    - Not synchronized with the DB
    - For newly created objects that have yet to be associated with the DB (or any session)
- Persistent
    - This is an object whose state is currently managed by Hibernate, and is synchronized with the DB through sessions
    - This means that we have a currently active session to synchronize the object
- Detached
    - This is an object that was previously persistent, but the session it was associated with has closed
    - It no longer has a session with the DB in order to be synchronized automatically

Hibernate has a feature called "Automatic Dirty Checking"

This means that if we modify a PERSISTENT entity in any way (such as using setter methods), Hibernate will automatically update that entity in the DB, with the currently open session.