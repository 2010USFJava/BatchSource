In order to practice Hibernate, we will form 7 groups of 3 each.

Each group will need to make a DAO Interface and Class that uses Hibernate under the hood.

You will need to create at least 2 models, with some sort of mapping between them. This mapping should at least be a one to many or many to many. If you want to practice with one to one's, just have a second mapping betwen them (or use a third model).

Each model should have at least 2 fields in addition to their IDs.

You should make a DAO for at least 1 of your models.

You should have support for all CRUD operations. As well as several forms of query methods such as:

findAll,
findById,
findByField1,
findByField2

You may of course rename these to whatever you want.


You will need to configure your SessionFactory.

You may use either annotations or xml.

However, if you have time to do extra, I recommend to do the other one you didn't initially use.

After that, feel free to explore.

Some ideas:

- Re-write some dao methods to use Criteria Query API
- Leverage some named queries
- Leverage transactions