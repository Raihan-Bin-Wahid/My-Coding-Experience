function sortByLanguage(list) {
  // thank you for checking out the Coding Meetup kata :)
  return list.sort((a, b) =>
    a.language == b.language
      ? a.firstName.localeCompare(b.firstName)
      : a.language.localeCompare(b.language)
  );
}
