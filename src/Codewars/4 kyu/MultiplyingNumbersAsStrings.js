function multiply(a, b) {
  return (BigInt(a) * BigInt(b)).toString().replace(/n/g, "");
}
